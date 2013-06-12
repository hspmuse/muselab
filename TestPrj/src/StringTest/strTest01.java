package StringTest;

public class strTest01 {
	
	public static void main(String [] args){
		
		StringBuffer strA = new StringBuffer();
		strA.append("at com.ibatis.sqlmap.engine.mapping.statement.MappedStatement.executeUpdate(MappedStatement.java:107)\n");
		strA.append("--- Cause: java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 무결성 제약 조건(HIRA_ADMIN.PK_TBDUC100) 위배됩니다\n");
		strA.append("\n");
		strA.append("        at com.ibatis.sqlmap.engine.mapping.statement.MappedStatement.executeUpdate(MappedStatement.java:107)               \n");
		strA.append("        at com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate.insert(SqlMapExecutorDelegate.java:393)                     \n");
		strA.append("        at com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl.insert(SqlMapSessionImpl.java:82)                                \n");
		strA.append("        at org.springframework.orm.ibatis.SqlMapClientTemplate$9.doInSqlMapClient(SqlMapClientTemplate.java:399)            \n");
		strA.append("        at org.springframework.orm.ibatis.SqlMapClientTemplate.execute(SqlMapClientTemplate.java:209)                       \n");
		strA.append("        ... 90 more                                                                                                         \n");
		strA.append("Caused by: java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 무결성 제약 조건(HIRA_ADMIN.PK_TBDUC100) 위배됩니다\n");
		strA.append("                                                                                                                            \n");
		strA.append("        at oracle.jdbc.driver.SQLStateMapping.newSQLException(SQLStateMapping.java:85)                                      \n");
		strA.append("        at oracle.jdbc.driver.DatabaseError.newSQLException(DatabaseError.java:133)                                         \n");
		strA.append("        at oracle.jdbc.driver.DatabaseError.throwSqlException(DatabaseError.java:206)                                       \n");
		strA.append("        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:455)                                                    \n");
		strA.append("        at oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:413)                                                    \n");
		strA.append("        at oracle.jdbc.driver.T4C8Oall.receive(T4C8Oall.java:1035)                                                          \n");
		strA.append("        at oracle.jdbc.driver.T4CPreparedStatement.doOall8(T4CPreparedStatement.java:194)                                   \n");
        strA.append("                      at oracle.jdbc.driver.T4CPreparedStatement.executeForRows(T4CPreparedStatement.java:953)                \n");            
        strA.append("                      at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1224)                   \n");            
        strA.append("                      at oracle.jdbc.driver.OraclePreparedStatement.executeInternal(OraclePreparedStatement.java:3386)        \n");            
        strA.append("                      at oracle.jdbc.driver.OraclePreparedStatement.execute(OraclePreparedStatement.java:3487)                \n");            
        strA.append("                      at oracle.jdbc.driver.OraclePreparedStatementWrapper.execute(OraclePreparedStatementWrapper.java:1374)  \n");            
        strA.append("                      at weblogic.jdbc.wrapper.PreparedStatement.execute(PreparedStatement.java:99)                           \n");            
        strA.append("                      at com.javaservice.jennifer.trace.sql.PreparedStatement.execute(Unknown Source)                         \n");            
        strA.append("                      at com.ibatis.sqlmap.engine.execution.SqlExecutor.executeUpdate(SqlExecutor.java:80)                    \n");            
        strA.append("                      at com.ibatis.sqlmap.engine.mapping.statement.MappedStatement.sqlExecuteUpdate(MappedStatement.java:216)\n");            
        strA.append("                      at com.ibatis.sqlmap.engine.mapping.statement.MappedStatement.executeUpdate(MappedStatement.java:94)    \n");            
        strA.append("                      ... 94 more                                                                                             \n");
        
        System.out.println(rtnOraErrStr(strA.toString()));
        
        System.out.println(rtnOraErrStr("dfd ORA-  dfsf"));
        
	}
	
	public static String rtnOraErrStr(String errStr) {
		
		String tmp1 = "";
		String tmp2 = "";
		
		System.out.println(errStr.indexOf("ORA-"));
		if(errStr.indexOf("ORA-") == -1 ){
			return "";
		} else {
			tmp1 = errStr.substring(errStr.indexOf("ORA-"));
		}
		
		if(tmp1.indexOf("\n") == -1 ){
			return "";
		} else {
			tmp2 = tmp1.substring(0,tmp1.indexOf("\n"));
		}
		
		return tmp2;
	}
	
}
