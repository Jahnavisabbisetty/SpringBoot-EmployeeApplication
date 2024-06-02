package ltts.com.EmployeeApplication.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {


    @Value("${connection}")
    private String mongodbUri;


    @Override
    public String getDatabaseName() {
        return "EmployeeDB";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(mongodbUri);
    }
}
