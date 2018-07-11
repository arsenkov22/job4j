package ru.job4j.calculate;

import org.hamcrest.core.Is;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
* Test.
*
* @author Alexander Arsenkov(arsenkov22@mail.ru)
* @version $Id$
* @since 0.1
*/

public class CalculateTest {
/*
* Test echo.
*/
 @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Alexander Arsenkov";
    String expect = "Echo, echo, echo : Alexander Arsenkov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, Is.is(expect));
}
 
}
