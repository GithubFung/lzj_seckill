// package com.lzj_seckill.config;
//
// import org.springframework.amqp.core.Binding;
// import org.springframework.amqp.core.BindingBuilder;
// import org.springframework.amqp.core.FanoutExchange;
// import org.springframework.amqp.core.Queue;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// /**
//  * RabbitMQ配置类
//  * Created by 小冯 on 2023/1/7 18:35
//  */
// @Configuration
// public class RabbitMQConfig {
//     private static final String QUEUE01 = "queue_fanout01";
//     private static final String QUEUE02 = "queue_fanout02";
//     private static final String EXCHANGNE = "fanoutExchange";
//
//     @Bean
//     public Queue queue() {
//         return new Queue("queue", true);
//     }
//
//     @Bean
//     public Queue queue01() {
//         return new Queue(QUEUE01);
//     }
//
//     @Bean
//     public Queue queue02() {
//         return new Queue(QUEUE02);
//     }
//
//     @Bean
//     public FanoutExchange fanoutExchange() {
//         return new FanoutExchange(EXCHANGNE);
//     }
//
//     @Bean
//     public Binding binding01() {
//         return BindingBuilder.bind(queue01()).to(fanoutExchange());
//     }
//
//     @Bean
//     public Binding binding02() {
//         return BindingBuilder.bind(queue02()).to(fanoutExchange());
//     }
// }
