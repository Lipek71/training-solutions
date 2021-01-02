package statemachine.trafficlight;

public enum TrafficLight {
    GREEN {
        @Override
        TrafficLight next() {
            return TrafficLight.YELLOW;
        }
    }, YELLOW {
        @Override
        TrafficLight next() {
            return TrafficLight.RED;
        }
    }, RED {
        @Override
        TrafficLight next() {
            return TrafficLight.RED_YELLOW;
        }
    }, RED_YELLOW {
        @Override
        TrafficLight next() {
            return TrafficLight.GREEN;
        }
    };

    abstract TrafficLight next();

}
