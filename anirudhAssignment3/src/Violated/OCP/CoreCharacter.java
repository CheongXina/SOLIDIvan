package Violated.OCP;

public class CoreCharacter {
    protected void getPosition() {}
    protected void walkUpdate() {}
    protected void walkUpdateBetter() {}
    protected void getPositionBetter() {}
//Violated because I modified a core source file, (modification instead of extension)
}
