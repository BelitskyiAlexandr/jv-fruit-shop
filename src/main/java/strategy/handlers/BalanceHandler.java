package strategy.handlers;

import db.Storage;
import model.FruitTransaction;
import strategy.OperationHandler;

public class BalanceHandler implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        Storage.fruitStorage.put(transaction.getFruit(), transaction.getQuantity());
    }
}
