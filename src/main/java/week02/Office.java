package week02;

import java.util.ArrayList;
import java.util.List;

import static week02.Controller.office;

public class Office {
    static List<MeetingRoom> meetingRooms = new ArrayList<>();

    public static void addMeetingRoom(MeetingRoom meetingRoom) {
        office.meetingRooms.add(meetingRoom);
    }

    public static void printNames() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getName());
        }
    }

    public static void printNamesReverse() {
        for (int i = meetingRooms.size(); i > 0; --i) {
            System.out.println(meetingRooms.get(i - 1).getName());
        }
    }

    public static void printEventNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public static void printAreas() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println("Tárgyaló neve: " + item.getName() + ", szélessége: " + item.getWidth() + "m hossza: " + item.getLength() + "m területe: " + item.getArea() + "m2.");
        }
    }

    public static void printMeetingRoomsWithName(String name) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().equals(name)) {
                System.out.println("Tárgyaló neve " + item.getName() + ", szélessége: " + item.getWidth() + "m hossza: " + item.getLength() + "m területe: " + item.getArea() + "m2.");
            }
        }
    }

    public static void printMeetingRoomsContains(String part) {
        for (MeetingRoom item : meetingRooms)
            //if (item.getName().toLowerCase().indexOf(part.toLowerCase()) != -1) {
            if (item.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println("Tárgyaló neve " + item.getName() + ", szélessége: " + item.getWidth() + "m hossza: " + item.getLength() + "m területe: " + item.getArea() + "m2.");
            }
    }

    public static void printAreasLargeThan(int area) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getArea() > area) {
                System.out.println("Tárgyaló neve " + item.getName() + ", szélessége: " + item.getWidth() + "m hossza: " + item.getLength() + "m területe: " + item.getArea() + "m2.");
            }
        }

    }
}
