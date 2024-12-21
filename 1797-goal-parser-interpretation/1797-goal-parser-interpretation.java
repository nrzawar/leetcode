class Solution {
    public String interpret(String command) {
        //command.replaceAll();
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
