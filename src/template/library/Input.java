package template.library;

public class Input
{
    public int GetAxis(boolean teclaPositiva, boolean teclaNegativa)
    {
        return teclaPositiva ? -1 : teclaNegativa ? 1 : 0;
    }
}