package tokpyt.bankssytemriosbd.backend.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

//public class ReplicationRoutingDataSource extends AbstractRoutingDataSource {
////    @Override
////    protected Object determineCurrentLookupKey() {
////        // Wybiera źródło danych na podstawie trybu transakcji:
////        return TransactionSynchronizationManager.isCurrentTransactionReadOnly() ? "read" : "write";
////    }
//}
