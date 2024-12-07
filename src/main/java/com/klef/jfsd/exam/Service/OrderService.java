package com.klef.jfsd.exam.Service;
import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
