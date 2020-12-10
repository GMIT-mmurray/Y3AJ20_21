public class Main {

    public static void main(String[] args) {
	    EmployeeStreamMethods esm = new EmployeeStreamMethods();
	   // esm.whenBuildStreamFromElements_ObtainStream();
	   // esm.whenIncrementSalaryForEachEmployee_thenApplyNewSalary();
	   // esm.whenIncrementSalaryUsingPeek_thenApplyNewSalary();
       // esm.whenMapIdToEmployees_thenGetEmployeeStream();
       // esm.whenFlatMapEmployeeNames_thenGetNameStream();
       // esm.whenFilterEmployees_thenGetFilteredStream();
       // esm.whenFindFirst_thenGetFirstEmployeeInStream();
       //esm.whenSortStream_thenGetSortedStream();
       // esm.whenFindMax_thenGetMaxElementFromStream();
       // esm.whenFindMin_thenGetMinElementFromStream();
        //esm.whenApplyMatch_thenReturnBoolean();
        //esm.whenFindMaxOnIntStream_thenGetMaxInteger();
        //esm.whenApplySumOnIntStream_thenGetSum();
        //esm.whenApplySummarizing_thenGetBasicStats();
        //esm.whenApplySummaryStatistics_thenGetBasicStats();
        esm.whenStreamPartition_thenGetMap();

    }
}
