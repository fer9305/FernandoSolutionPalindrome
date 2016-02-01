package com.developersdelicias.repository;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;

import com.developersdelicias.util.file.FileUtils;

public abstract class PalindromeRepositoryTest extends RepositoryTest {

	

	@Override
	protected IDataSet getDataSet() throws Exception {
		IDataSet palindromeTestFixtures = new FlatXmlDataSetBuilder()
				.build(FileUtils.getInputStreamFromResourceFile("/palindromes.xml"));
		return palindromeTestFixtures;
	}

	@Override
	protected String getTableName() {
		return "PALINDROMES";
	}
}
