package net.developia.spring06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import net.developia.spring06.mapper.Sample1Mapper;
import net.developia.spring06.mapper.Sample2Mapper;

@Service
@Log4j
public class SampleTxServiceImpl implements SampleTxService {

	@Setter(onMethod_ = { @Autowired })
	private Sample1Mapper mapper1;
	
	@Setter(onMethod_ = { @Autowired })
	private Sample2Mapper mapper2;
	
	@Override
	public void addData(String value) {
		log.info("mapper...................1");
		mapper1.insertCol1(value);

		log.info("mapper...................2");
		mapper2.insertCol2(value);

		log.info("mapper...................end");
	}
}
