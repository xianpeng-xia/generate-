package com.example;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author chen
 * @date 2018/7/20 10:33
 */
public class MyGenerator {

    //private static String suffix = "center";
    //private static String suffix = "log";
    private static String suffix = "center";
    /**
     * db
     */
    private static String url = "jdbc:mysql://192.168.1.10:3306/bet_" + suffix + "?serverTimezone=CTT";
    private static String user = "root";
    private static String password = "gbankclub";
    private static String dirverName = "com.mysql.jdbc.Driver";
    private static String author = "夏先鹏";
    private static String outputDir = "/Users/michael/Documents";
    /**
     * 生成的东西放在这个包里
     */
    private static String packageName = "com.gbank.bet";

    public static void main(String[] args) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = url;

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
            .setUrl(dbUrl)
            .setUsername(user)
            .setPassword(password)
            .setDriverName(dirverName);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
            .setCapitalMode(true)
            // 生成字段常量
            .setEntityColumnConstant(false)
            .setEntityLombokModel(false)
            .setDbColumnUnderline(true)
            .setNaming(NamingStrategy.underline_to_camel);

        config.setActiveRecord(false)
            .setEnableCache(false)
            .setAuthor(author)
            .setOutputDir(outputDir)
            .setFileOverride(true)
            .setServiceName("%sService");

        new AutoGenerator().setGlobalConfig(config)
            .setDataSource(dataSourceConfig)
            .setStrategy(strategyConfig)
            .setPackageInfo(
                new PackageConfig()
                    .setParent(packageName)
                    .setController("controller")
                    .setEntity("entity")
                    .setMapper("mapper")
                    .setService("service")
                    .setServiceImpl(suffix + ".service.impl")
                    .setMapper(suffix + ".mapper")
            ).execute();
    }
}