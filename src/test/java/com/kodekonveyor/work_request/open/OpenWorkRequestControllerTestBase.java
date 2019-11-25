package com.kodekonveyor.work_request.open;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.kodekonveyor.authentication.UserTestData;
import com.kodekonveyor.work_request.AddressTestData;
import com.kodekonveyor.work_request.WorkRequestRepository;
import com.kodekonveyor.work_request.WorkRequestRepositoryStub;
import com.kodekonveyor.work_request.WorkRequestTestData;

public class OpenWorkRequestControllerTestBase {
	@InjectMocks
	protected OpenWorkRequestController openWorkRequestController;
	@Mock
	protected WorkRequestRepository workRequestRepository;
	protected WorkRequestTestData workRequestTestData;

	@BeforeEach
	protected void setUp() {
		final UserTestData userTestData = new UserTestData();
		final AddressTestData addressTestData = new AddressTestData();
		workRequestTestData = new WorkRequestTestData(userTestData,
				addressTestData);
		WorkRequestRepositoryStub.behaviour(workRequestRepository,
				workRequestTestData);
	}

}