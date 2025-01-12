package tokpyt.bankssytemriosbd.backend.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {
//    @Bean(name = "writeDataSource")
//    @Primary
//    @ConfigurationProperties("spring.datasource.write")
//    public DataSource writeDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "readDataSource")
//    @ConfigurationProperties("spring.datasource.read")
//    public DataSource readDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public DataSource routingDataSource(
//            @Qualifier("readDataSource") DataSource readDataSource,
//            @Qualifier("writeDataSource") DataSource writeDataSource
//    ) {
//
//        Map<Object, Object> dataSources = new HashMap<>();
//        dataSources.put("read", readDataSource);
//        dataSources.put("write", writeDataSource);
//
//        ReplicationRoutingDataSource routingDataSource = new ReplicationRoutingDataSource();
//        routingDataSource.setTargetDataSources(dataSources);
//        routingDataSource.setDefaultTargetDataSource(writeDataSource);
//
//        return routingDataSource;
//    }
//
//    @Bean
//    public DataSource dataSource(DataSource routingDataSource) {
//        return new LazyConnectionDataSourceProxy(routingDataSource);
//    }
}
