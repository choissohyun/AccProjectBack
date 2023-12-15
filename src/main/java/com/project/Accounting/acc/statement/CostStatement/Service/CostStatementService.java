package com.project.Accounting.acc.statement.CostStatement.Service;

import java.util.HashMap;

public interface CostStatementService {
    HashMap<String, Object> getCostStatement(String toDate);
}
