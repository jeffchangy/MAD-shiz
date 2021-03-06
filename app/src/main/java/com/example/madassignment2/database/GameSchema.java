package com.example.madassignment2.database;

public class GameSchema {

    public static class SettingTable {
        public static final String NAME = "Settings";

        public static class Cols {
            public static final String MAP_WIDTH = "map_width";
            public static final String MAP_HEIGHT = "map_height";
            public static final String STARTING_MONEY = "starting_money";
        }
    }

    public static class StatusScreenTable {
        public static final String NAME = "StatusScreen";

        public static class Cols {
            public static final String CURR_MONEY = "current_money";
            public static final String GAME_TIME = "game_time";
            public static final String CITY_NAME = "city_name";
            public static final String POPULATION = "population";
            public static final String EMPLOYMENT_RATE = "employment_rate";
            public static final String NUM_RES = "resident_number";
            public static final String NUM_COMM = "commercial_number";
        }
    }

    public static class MapTable {
        public static final String NAME = "MapScreen";

        public static class Cols {
            public static final String TYPE = "type";
            public static final String POSITION = "position_building";
            public static final String STRUCTURE = "structure_type"; //this is the drawable id lol
            public static final String OWNER_NAME = "owner_name";
        }
    }
}
