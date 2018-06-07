package com.wanfangdata.weekly.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * mapper代码生成器
 * </p>
 */
public class MpGenerator {
	public static void main(String[] args) {
		String packageName = "com.wanfangdata.weekly";
		boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
		generateByTables(serviceNameStartWithI, packageName, "user", "admin","job_content","position","report");

	}

	private static void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
		GlobalConfig config = new GlobalConfig();
		String dbUrl = "jdbc:mysql://cd-cdb-qj5lr8nq.sql.tencentcdb.com:63932/weekly?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL)
				.setUrl(dbUrl)
				.setUsername("root")
				.setPassword("mbr821016")
				.setDriverName("com.mysql.jdbc.Driver");
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig
				.setCapitalMode(true)
				.setEntityLombokModel(false)
				.setDbColumnUnderline(true)
				.setNaming(NamingStrategy.underline_to_camel)
				.setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
		config.setActiveRecord(false)
				.setAuthor("meibaorui")
				.setOutputDir("/Users/meibaorui/mq")
				.setFileOverride(true);
		if (!serviceNameStartWithI) {
			config.setServiceName("%sService");
		}
		new AutoGenerator().setGlobalConfig(config)
				.setDataSource(dataSourceConfig)
				.setStrategy(strategyConfig)
				.setPackageInfo(
						new PackageConfig()
								.setParent(packageName)
								//.setController("controller")
								.setEntity("entity")
				).execute();
	}

	private static void generateByTables(String packageName, String... tableNames) {
		generateByTables(true, packageName, tableNames);
	}

}
