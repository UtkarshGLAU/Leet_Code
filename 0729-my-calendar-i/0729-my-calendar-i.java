class MyCalendar {
    private List<int[]> arr;

    public MyCalendar() {
        arr = new ArrayList<>();
        arr.add(new int[] { 0, 0 });
    }

    public boolean book(int startTime, int endTime) {
        for (int i = 1; i < arr.size(); i++) {
            int[] interval = arr.get(i);
            if (!(endTime <= interval[0] || startTime >= interval[1])) {
                return false;
            }
        }

        arr.add(new int[] { startTime, endTime });
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */