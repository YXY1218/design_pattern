package test07;

import java.util.ArrayList;

public class Zapper {
    public static void main(String[] args) {
        DevicePackage allLights; // 所有灯设备的集合
        Device light, light2, blower, airCleaner, Multimedia;
        // 初始化设备
        allLights = new DevicePackage();
        light = new Light();
        light2 = new Light();
        blower = new Blower();
        airCleaner = new airCleaner();
        Multimedia = new Multimedia();
        allLights.addDevice(light);
        allLights.addDevice(light2);

        // 初始化命令
        Command lightsOpenCommand, lightsCloseCommand, blowerOpenCommand, blowerCloseCommand, airOpenCommand,
                airCloseCommand, multiOpenCommand, multiCloseCommand;
        lightsOpenCommand = new DeviceOpenCommand(allLights);
        lightsCloseCommand = new DeviceCloseCommand(allLights);
        blowerOpenCommand = new DeviceOpenCommand(blower);
        blowerCloseCommand = new DeviceCloseCommand(blower);
        airOpenCommand = new DeviceOpenCommand(airCleaner);
        airCloseCommand = new DeviceCloseCommand(airCleaner);
        multiOpenCommand = new DeviceOpenCommand(Multimedia);
        multiCloseCommand = new DeviceCloseCommand(Multimedia);

        // 命令集成为多功能遥控
        Controller controller = new Controller(lightsOpenCommand, lightsCloseCommand, blowerOpenCommand,
                blowerCloseCommand, airOpenCommand, airCloseCommand, multiOpenCommand, multiCloseCommand);

        controller.openAllLights();
        controller.openBlower();
        controller.openMulti();
        controller.openAirCleaner();
        controller.closeAllLights();
        controller.closeBlower();
        controller.closeMulti();
        controller.closeAirCleaner();
    }
}

class Controller {
    private Command lightsOpenCommand, lightsCloseCommand, blowerOpenCommand, blowerCloseCommand, airOpenCommand,
            airCloseCommand, multiOpenCommand, multiCloseCommand;

    public Controller(Command lightsOpenCommand, Command lightsCloseCommand, Command blowerOpenCommand,
                      Command blowerCloseCommand, Command airOpenCommand, Command airCloseCommand, Command multiOpenCommand,
                      Command multiCloseCommand) {
        this.lightsOpenCommand = lightsOpenCommand;
        this.lightsCloseCommand = lightsCloseCommand;
        this.blowerOpenCommand = blowerOpenCommand;
        this.blowerCloseCommand = blowerCloseCommand;
        this.airCloseCommand = airCloseCommand;
        this.airOpenCommand = airOpenCommand;
        this.multiCloseCommand = multiCloseCommand;
        this.multiOpenCommand = multiOpenCommand;
    }

    public void openAllLights() {
        lightsOpenCommand.execute();
    }

    public void closeAllLights() {
        lightsCloseCommand.execute();
    }

    public void openBlower() {
        blowerOpenCommand.execute();
    }

    public void closeBlower() {
        blowerCloseCommand.execute();
    }

    public void openAirCleaner() {
        airOpenCommand.execute();
    }

    public void closeAirCleaner() {
        airCloseCommand.execute();
    }

    public void openMulti() {
        multiOpenCommand.execute();
    }

    public void closeMulti() {
        multiCloseCommand.execute();
    }
}

abstract class Command {
    protected Device device;

    public abstract void execute();
}

class DeviceOpenCommand extends Command {
    public DeviceOpenCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.open();
    }

}

class DeviceCloseCommand extends Command {
    public DeviceCloseCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.close();
    }

}

abstract class Device {
    public abstract void close();

    public abstract void open();
}

class DevicePackage extends Device {
    private ArrayList<Device> list = new ArrayList<Device>();

    public void addDevice(Device device) {
        list.add(device);
    }

    public void removeDevice(Device device) {
        list.remove(device);
    }

    @Override
    public void close() {
        int index = 1;
        for (Device device : list) {
            System.out.print(index + "号");
            device.close();
            index++;
        }
    }

    @Override
    public void open() {
        int index = 1;
        for (Device device : list) {
            System.out.print(index + "号");
            device.open();
            index++;
        }
    }

}

class airCleaner extends Device {

    @Override
    public void close() {
        System.out.println("空调关了");

    }

    @Override
    public void open() {
        System.out.println("空调开了");
    }

}

class Multimedia extends Device {

    @Override
    public void close() {
        System.out.println("多媒体关了");

    }

    @Override
    public void open() {
        System.out.println("多媒体开了");
    }

}

class Blower extends Device {

    @Override
    public void close() {
        System.out.println("风扇关了");

    }

    @Override
    public void open() {
        System.out.println("风扇开了");
    }

}

class Light extends Device {

    @Override
    public void close() {
        System.out.println("灯关了");
    }

    @Override
    public void open() {
        System.out.println("灯开了");
    }

}
