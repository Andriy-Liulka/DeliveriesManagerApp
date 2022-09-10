package com.example.homework.map;

import com.example.homework.Entity.*;
import com.example.homework.dto.*;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, componentModel = "spring")
public interface MainMapper {
    CustomerDto toCustomerDto(Customer entity);

    @Mapping(target = "user", ignore = true)
    Customer toCustomer(CustomerDto entity);

    DeliveryDto toDeliveryDto(Delivery entity);

    @Mapping(target = "transporter", ignore = true)
    @Mapping(target = "goods", ignore = true)
    Delivery toDelivery(DeliveryDto entity);

    GoodDto toGoodDto( Good entity);

    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "deliveries", ignore = true)
    Good toGood(GoodDto entity);

    OfferDto toOfferDto(Offer entity);

    @Mapping(target = "transporter", ignore = true)
    Offer toOffer(OfferDto entity);

    TransporterDto toTransporterDto(Transporter entity);

    @Mapping(target = "user", ignore = true)
    Transporter toTransporter(TransporterDto entity);

    UserDto toUserDto(User entity);

    @Mapping(target = "role", ignore = true)
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "transporter", ignore = true)
    User toUser(UserDto entity);
}
