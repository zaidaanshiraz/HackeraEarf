def find_replace_ids(employees):
    mapping = {}
    for employee in employees:
        id = employee['id']
        name = employee['name']
        mapping[id] = len(mapping) + 1
    return [{"id": mapping.get(i, i), "name": n} for i, employee in enumerate(employees)]