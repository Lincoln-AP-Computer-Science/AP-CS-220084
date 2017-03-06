class rectangular_pyramid:
    def __init__(self, l, w, h):
        self.l = l
        self.w = w
        self.h = h
    
    def surface_area():
        return l * w + l * math.sqrt((w/2)**2 + h**2) + w * math.sqrt((l/2)**2 + h**2)
    
    def volume():
        return l * w * h / 3
