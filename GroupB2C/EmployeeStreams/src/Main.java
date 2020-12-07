public class Main {

    public static void main(String[] args) {
        EmployeeStreamMethods esm = new EmployeeStreamMethods();
        //esm.whenBuildStreamFromElements_ObtainStream();
        //esm.whenIncrementSalaryForEachEmployee_thenApplyNewSalary();
        //esm.whenIncrementSalaryUsingPeek_thenApplyNewSalary();
        //esm.whenMapIdToEmployees_thenGetEmployeeStream();
        //esm.whenFilterEmployees_thenGetFilteredStream();
        //esm.whenFindFirst_thenGetFirstEmployeeInStream();
        //esm.whenSortStream_thenGetSortedStream();
        //esm.whenFindMin_thenGetMinElementFromStream();
        // esm.whenFindMax_thenGetMaxElementFromStream();
        //esm.whenApplyMatch_thenReturnBoolean();
        esm.whenApplySummaryStatistics_thenGetBasicStats();
    }
}
