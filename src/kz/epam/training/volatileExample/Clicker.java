package kz.epam.training.volatileExample;

class Clicker extends Thread {
    int click = 0;
    private volatile boolean running = true;

    public Clicker() {
    }

    public void run() {
        while (running) {
            click++;
        }
    }

    public void stopClick() {
        running = false;
    }
}
