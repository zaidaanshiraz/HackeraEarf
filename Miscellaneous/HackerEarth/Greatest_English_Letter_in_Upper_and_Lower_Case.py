def greatest_letter(s):
    for c in s:
        if 'a' <= c <= 'z':
            if not s[s.index(c)+1:].islower():
                return chr(ord('A') + ord(c) - ord('a'))
    return ''