package com.uca.capas.tarea.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea.domain.Producto;

@Controller
public class TareaController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("commons/index");
		return mav;
	}

	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("commons/index");
		}
		else {
			mav.addObject("codigo", product.getCodigo());
			mav.addObject("nombre", product.getNombre());
			mav.addObject("marca", product.getMarca());
			mav.addObject("descripcion", product.getDescripcion());
			mav.addObject("existencias", product.getExistencias());
			mav.addObject("fecha_ingreso", product.getFecha_ingreso());

			mav.setViewName("resultado");
			
		}
		return mav;
				}
	

		
		



		
		
	

	


}
