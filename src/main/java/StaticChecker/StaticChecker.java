package StaticChecker;

public class StaticChecker {


    /**
     * Uses the parser to parse the code block and return true if the catch block of the exception is empty.
     * @param codeBlock the code to check
     * @return boolean true or false
     */
    public static boolean emptyErrorChecker(String codeBlock) {
        //if catch block is empty, return true
        return false;
    }


    /**
     * Uses the parser to parse the code block and then checks if the code block over catches the exception (e.g. catches twice which is useless code)
     * @param codeblock the code to check
     * @return boolean true or false
     */
    public static boolean overCatchChecker(String codeblock) {

        return false;
    }


    /**
     * Uses the parser to parse the code block and then checks if the code block contains "TODO" or "FIXME"
     * @param codeblock the code to check
     * @return boolean true or false
     */
    public static boolean uselessPhrasesChecker(String codeblock) {
        if(codeblock.contains("FIXME") || codeblock.contains("TODO"))
            return true;

        return false;
    }

}
