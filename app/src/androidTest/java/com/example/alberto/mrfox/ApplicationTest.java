package com.example.alberto.mrfox;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//**
// * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
// */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }


/**
 * @author ernesto
 */

public class ApplicationTest extends ActivityInstrumentationTestCase2<MyLogin> {

    private Button loginbutton;
    private MyLogin actividad;

    public ApplicationTest() {
        super(MyLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();

        loginbutton = (Button) actividad.findViewById(R.id.btNext);
        // MainActivity actividad = getActivity();
        // suma = (Button) actividad.findViewById(R.id.button1);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testLoginSignup() {
        TouchUtils.clickView(this, loginbutton);


    }


}
