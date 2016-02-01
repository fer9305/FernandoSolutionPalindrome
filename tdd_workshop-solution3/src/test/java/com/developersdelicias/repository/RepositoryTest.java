package com.developersdelicias.repository;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.developersdelicias.configuration.DatabaseUnitTestsConfiguration;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = DatabaseUnitTestsConfiguration.class)

public abstract class RepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	DataSource dataSource;
	protected Repository<?> repository; 

	protected IDataSet dataSet;

	@Before
	public void setup() throws Exception {
		IDatabaseConnection connection = new DatabaseDataSourceConnection(dataSource);
		dataSet = getDataSet();
		DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
	}

	@Test
	public void testList() throws DataSetException {
		ITable expectedTable = dataSet.getTable(getTableName());
		Assert.assertEquals(expectedTable.getRowCount(), repository.retrieveAll().size());
	}

	protected abstract IDataSet getDataSet() throws Exception;

	protected abstract String getTableName();


}
