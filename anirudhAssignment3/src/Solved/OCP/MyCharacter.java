package Solved.OCP;

public class MyCharacter extends CoreCharacter {
/*Let's say the core Character class does not have enough functionality for what I'm trying to achieve,
therefore I'd solve the OCP violation by creating a new class and override the core class functions,
so I can extend without modifying the core.

 This is how Unreal Engine is used if you don't want to download the engine source code, you'd create your own class
 that inherits from the class you want to extend, and use the new class instead of the core class.
 */
    @Override
    protected void getPosition() {}
    @Override
    protected void walkUpdate() {}
}
