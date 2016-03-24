/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
import java.io.IOException;
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

    static int cylonSpeed = 10000;

    @Test
    public  void test() throws InterruptedException, IOException {

        System.out.println("<--Pi4J--> Pi-Face GPIO Example ... started.");

        // create the Pi-Face controller
        final PiFace piface = new PiFaceDevice(PiFace.DEFAULT_ADDRESS, Spi.CHANNEL_0);
        // run continuously until user aborts with CTRL-C
        while(true) {

            piface.getLed(7).toggle();
        }

        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        //gpio.shutdown();  // <-- uncomment if your program terminates
    }
}
