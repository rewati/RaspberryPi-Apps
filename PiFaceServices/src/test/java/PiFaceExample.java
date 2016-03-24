/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
import java.io.IOException;

import com.pi4j.component.light.LED;
import com.pi4j.component.switches.SwitchListener;
import com.pi4j.component.switches.SwitchState;
import com.pi4j.component.switches.SwitchStateChangeEvent;
import com.pi4j.device.piface.PiFace;
import com.pi4j.device.piface.PiFaceLed;
import com.pi4j.device.piface.PiFaceRelay;
import com.pi4j.device.piface.PiFaceSwitch;
import com.pi4j.device.piface.impl.PiFaceDevice;
import com.pi4j.wiringpi.Spi;
import org.junit.Test;

/**
 * <p>
 * This example code demonstrates how to use the PiFace device interface
 * for GPIO pin state control and monitoring.
 * </p>
 *
 * @author Robert Savage
 */
public class PiFaceExample {


    @Test
    public  void test() throws InterruptedException, IOException {

        System.out.println("<--Pi4J--> Pi-Face GPIO Example ... started.");

        // create the Pi-Face controller
        final PiFace piface = new PiFaceDevice(PiFace.DEFAULT_ADDRESS, Spi.CHANNEL_0);
            int i =3;
            while(true) {
                if(i>7)
                    i=3;
                LED l = piface.getLed(i);
                l.toggle();
                Thread.sleep(500);
                l.toggle();
                ++i;
            }

    }

    @Test
    public  void test1() throws InterruptedException, IOException {

        System.out.println("<--Pi4J--> Pi-Face GPIO Example ... started.");

        // create the Pi-Face controller
        final PiFace piface = new PiFaceDevice(PiFace.DEFAULT_ADDRESS, Spi.CHANNEL_0);
        int i =3;
        while(true) {
            if(i>7)
                i=1;
            LED l = piface.getLed(i);
            l.toggle();
            Thread.sleep(100);
            l.toggle();
            ++i;
        }


    }
}
