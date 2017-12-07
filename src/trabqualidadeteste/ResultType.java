/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabqualidadeteste;

/**
 *
 * @author Eduardo
 */
public class ResultType {

    public enum SearchResult {
        NotFound,
        FoundExact,
        FoundGreater,
        FoundLess
    };
    private SearchResult searchResult;
    private Integer resultIndex;
    private Integer resultValue;

    public void ReturnType(SearchResult searchResult,
                           Integer resultIndex,
                           Integer resultValue) {
        
        this.searchResult = searchResult;
        this.resultIndex = resultIndex;
        this.resultValue = resultValue;
    }

    @Override
    public String toString() {
        return "ResultType" + "\n   searchResult: " + searchResult + "\n   resultValue: " + resultValue + "\n   resultIndex: " + resultIndex;
    }
}
