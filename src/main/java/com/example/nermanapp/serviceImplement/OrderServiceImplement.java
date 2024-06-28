package com.example.nermanapp.serviceImplement;

import com.example.nermanapp.model.Order;
import com.example.nermanapp.repository.CartRepo;
import com.example.nermanapp.repository.OrderRepo;
import com.example.nermanapp.repository.UserRepo;
import com.example.nermanapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImplement implements OrderService {
//    @Autowired
//    private OrderRepo orderRepo;
//    @Autowired
//    private UserRepo userRepo;
//    @Autowired
//    private CartRepo cartRepo;
//
//    @Override
//    public List<Order> getAllOrder() {
//        return orderRepo.findAll();
//    }
//
//    @Override
//    public List<Order> getOrderOfUser(int customerId) {
//        var user = userRepo.findUserByUsersID(customerId).orElse(null);
//        if (user != null) {
//            return orderRepo.findOrderByUser(user);
//        } else {
//            return new ArrayList<>();
//        }
//    }
//
//    @Override
//    public OrderResponse createOrder(CreateOrderRequest request) {
//        int userId = request.getUser();
//        double total = request.getTotal();
//        LocalDateTime dateTime = LocalDateTime.now();
//        var user = userRepo.findUserByUsersID(userId).orElse(null);
//        if (user != null) {
//            double balance = user.getAccountBalance();
//            if (balance >= total) {
//                user.setAccountBalance(user.getAccountBalance() - total);
//                List<Cart> cartItems = cartRepo.findByUser(user);
//                if (!cartItems.isEmpty()) {
//                    Order order = Order.builder()
//                            .orderDate(dateTime)
//                            .total(total)
//                            .user(user)
//                            .build();
//                    orderRepo.save(order);
//                    userRepo.save(user);
//                    return OrderResponse.builder()
//                            .status("Create order successful")
//                            .order(order)
//                            .build();
//                } else {
//                    return OrderResponse.builder()
//                            .status("Create fail")
//                            .order(null)
//                            .build();
//                }
//            } else {
//                return OrderResponse.builder()
//                        .status("Your balance is not enough")
//                        .order(null)
//                        .build();
//            }
//        } else {
//            return OrderResponse.builder()
//                    .status("User not found")
//                    .order(null)
//                    .build();
//        }
//    }
}
