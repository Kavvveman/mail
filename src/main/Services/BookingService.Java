@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;



    public String createBooking(Room room){
        bookingRepository.save(room);
        return  "Room adeded";
    }

    // public Booking createBooking(BookingsModel booking, Integer BookingID) {
    //     Long days = calculateDays(booking.getCheckIn(), booking.getCheckOut());
    //     Long amount = calculateBookingAmount(days);
    //     Optional<UsersModel> user = userRepository.findById(userId);

    //     System.out.println(user.get().getFirstName());
    //     try {
    //         if(validateBooking(booking.getCheckIn(),booking.getCheckOut(),booking.getRoom().getRoomName())){
    //             return roomRepository.findById(roomId).map(
    //                     room -> {
    //                         booking.setRoom(room);
    //                         booking.setDays(days);
    //                         booking.setAmount(amount);
    //                         booking.setUser(user.get());
    //                         System.out.println(booking.toString());
    //                         return bookingRepository.save(booking);
    //                     }
    //             ).orElseThrow(() -> new RuntimeException());
    //         }
    //     } catch (Exception e) {
    //         throw new RuntimeException(e);
    //     }
    //     return null;

    // }

    public Boolean validateBooking(LocalDate from, LocalDate to, String roomName) throws Exception {
        List<Booking> allBookings = getAllBookingsByRoomName(roomName);
        if (allBookings.stream().count() == 0) {
            return true;
        }
        for (Booking booking : allBookings) {
            if (from.isBefore(booking.getCheckIn()) && to.isBefore(booking.getCheckIn())) {
                return true;
            }
            if (from.isAfter(booking.getCheckIn()) && to.isAfter(booking.getCheckOut())) {
                return true;
            }
        }

        return false;

    }



    //Add Functionality for Bookings
}
