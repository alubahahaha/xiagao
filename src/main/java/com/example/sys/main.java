package com.example.sys;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class main {
    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new
                AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig =
                new DataSourceConfig();

        dataSourceConfig.setDbType(DbType.MYSQL);

        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/bookstore?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC&allowPublicKeyRetrieval=true");

                dataSourceConfig.setUsername("root");
                dataSourceConfig.setPassword("123456");
                dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
                autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new
                GlobalConfig();

        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        globalConfig.setOpen(false);

        globalConfig.setAuthor("example");

        globalConfig.setServiceName("%sService");

        autoGenerator.setGlobalConfig(globalConfig
        );
        //包信息
        PackageConfig packageConfig = new
                PackageConfig();

        packageConfig.setParent("com.example.sys");


        packageConfig.setController("controller");

        packageConfig.setService("service");

        packageConfig.setServiceImpl("service.impl");
                packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");

        autoGenerator.setPackageInfo(packageConfig);
        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();

        strategyConfig.setEntityLombokModel(true);

        strategyConfig.setNaming(NamingStrategy.underline_to_camel);

        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);

        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();
    }
}
