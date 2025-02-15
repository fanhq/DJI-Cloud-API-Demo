package com.dji.sample.component;

import com.dji.sample.component.redis.RedisConst;
import com.dji.sample.manage.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author sean.zhou
 * @date 2021/11/24
 * @version 0.1
 */
@Component
public class ApplicationBootInitial implements CommandLineRunner {

    @Autowired
    private IDeviceService deviceService;

    /**
     * Subscribe to the devices that exist in the redis when the program starts,
     * to prevent the data from being different from the pilot side due to program interruptions.
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        int start = RedisConst.DEVICE_ONLINE_PREFIX.length();

       // RedisOpsUtils.getAllKeys(RedisConst.DEVICE_ONLINE_PREFIX + "*")
        //        .forEach(key -> deviceService.subscribeTopicOnline(key.substring(start)));

    }
}