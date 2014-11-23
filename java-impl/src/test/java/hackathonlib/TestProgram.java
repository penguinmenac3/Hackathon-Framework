package hackathonlib;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * A test to determine if the java network impl works.
 * @author Michael Fürst
 * @version 1.0
 * @since 23.11.2014
 */
public class TestProgram implements IGameManager {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Define hostname and port.
        String hostname = "localhost";
        int port = 25555;

        // Open up a tcp connection.
        Socket client = new Socket(hostname, port);
        Connection connection = new Connection(client, new TestProgram(), -1);

        // Start the client loop.
        connection.startClientLoop();

        // Join the connection since it's callback based.
        connection.join();
    }

    @Override
    public void updateScene(List<GameObject> scene) {
        // TODO add code here
    }

    @Override
    public String getCommand() {
        // TODO add code here
        return null;
    }

    @Override
    public String getName() {
        // TODO add code here
        return "Test";
    }

    @Override
    public Double getSpeed() {
        // TODO add code here
        return null;
    }

    @Override
    public Double getRotation() {
        // TODO add code here
        return null;
    }

    @Override
    public boolean doPing() {
        // TODO add code here
        return true;
    }


    // *********************************************************************************************
    // SERVER STUFF BELOW
    // *********************************************************************************************

    @Override
    public void connectionStarted(Connection connection) {
        // Do nothing
    }

    @Override
    public void connectionReady(Connection connection) {
        // Do nothing
    }

    @Override
    public void connectionLost(Connection connection) {
        // Do nothing
    }

    @Override
    public void executeCommand(Connection connection, String p) {
        // Do nothing
    }

    @Override
    public void changeSpeed(Connection connection, double p) {
        // Do nothing
    }

    @Override
    public void changeRotation(Connection connection, double p) {
        // Do nothing
    }

    @Override
    public List<GameObject> getScene() {
        // Do nothing
        return null;
    }
}
