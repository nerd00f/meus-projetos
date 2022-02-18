# O script encontra quantas páginas
# tem em uma pasta do OpenOffice..

echo "$(exiftool *.odt | grep Page-count | cut -d ":" -f2 | tr '\n' '+')""0" | bc