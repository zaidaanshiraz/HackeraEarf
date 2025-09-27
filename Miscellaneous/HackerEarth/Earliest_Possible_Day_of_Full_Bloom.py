def earliestFullBloom(petalePerDay, plantTime):
    total_days = sum(plantTime)
    bloom_time = [day * ptd for day, ptd in zip(plantTime, petalePerDay)]
    sorted_bloom = sorted((bloom_time[i] + plantTime[i], i) for i in range(len(petalePerDay)))
    return min([i+1 for i, _ in sorted_bloom]) + total_days