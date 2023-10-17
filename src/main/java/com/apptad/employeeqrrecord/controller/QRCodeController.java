package com.apptad.employeeqrrecord.controller;

import java.awt.image.BufferedImage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apptad.employeeqrrecord.component.QRGenerator;
import com.apptad.employeeqrrecord.model.EmployeeProfile;

@RequestMapping("/barcodes")
@RestController
public class QRCodeController {

	@Autowired
	private QRGenerator qrGenerator;
	
	@PostMapping(value = "/zxing/empqrcode", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQRCode(@RequestBody EmployeeProfile employeeProfile) throws Exception {
        String data = employeeProfile.toString(); // convert UserProfile to a string
        return qrGenerator.generateQRCodeImage(data);
    }
	
	@PostMapping(value = "/zxing/qrcode", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> zxingQRCode(@RequestBody String barcode) throws Exception{
        return successResponse(QRGenerator.generateQRCode(barcode));
    }

    private ResponseEntity<BufferedImage> successResponse(BufferedImage image) {
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }
}
