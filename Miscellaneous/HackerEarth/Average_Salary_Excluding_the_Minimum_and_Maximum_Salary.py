def averageRating(rating):
    return sum(i for i in rating if i != min(rating) and i != max(rating)) / (len(rating) - 2)