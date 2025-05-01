package net.sf.sevenzipjbinding.impl;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class VolumedArchiveInStream implements IInStream {
    private static final String SEVEN_ZIP_FIRST_VOLUME_POSTFIX = ".7z.001";
    private long absoluteLength;
    private long absoluteOffset;
    private final IArchiveOpenVolumeCallback archiveOpenVolumeCallback;
    private IInStream currentInStream;
    private int currentIndex;
    private long currentVolumeLength;
    private long currentVolumeOffset;
    private String cuttedVolumeFilename;
    private List<Long> volumePositions;

    public VolumedArchiveInStream(IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) throws SevenZipException {
        this((String) iArchiveOpenVolumeCallback.getProperty(PropID.NAME), iArchiveOpenVolumeCallback);
    }

    private void openVolume(int i4, boolean z4) throws SevenZipException {
        if (this.currentIndex == i4) {
            return;
        }
        for (int size = this.volumePositions.size(); size < i4 && this.absoluteLength == -1; size++) {
            openVolume(size, false);
        }
        if (this.absoluteLength == -1 || this.volumePositions.size() > i4) {
            IInStream stream = this.archiveOpenVolumeCallback.getStream(this.cuttedVolumeFilename + MessageFormat.format("{0,number,000}", Integer.valueOf(i4)));
            if (stream == null) {
                List<Long> list = this.volumePositions;
                this.absoluteLength = list.get(list.size() - 1).longValue();
                return;
            }
            this.currentInStream = stream;
            if (this.volumePositions.size() == i4) {
                long seek = this.currentInStream.seek(0L, 2);
                this.currentVolumeLength = seek;
                if (seek != 0) {
                    List<Long> list2 = this.volumePositions;
                    list2.add(Long.valueOf(list2.get(i4 - 1).longValue() + this.currentVolumeLength));
                    if (z4) {
                        this.currentInStream.seek(0L, 0);
                    }
                } else {
                    throw new RuntimeException("Volume " + i4 + " is empty");
                }
            } else {
                this.currentVolumeLength = this.volumePositions.get(i4).longValue() - this.volumePositions.get(i4 - 1).longValue();
            }
            if (z4) {
                this.currentVolumeOffset = 0L;
                this.absoluteOffset = this.volumePositions.get(i4 - 1).longValue();
            }
            this.currentIndex = i4;
        }
    }

    private void openVolumeToAbsoluteOffset() throws SevenZipException {
        int size = this.volumePositions.size() - 1;
        long j4 = this.absoluteLength;
        if (j4 == -1 || this.absoluteOffset < j4) {
            while (this.volumePositions.get(size).longValue() > this.absoluteOffset) {
                size--;
            }
            if (size < this.volumePositions.size() - 1) {
                openVolume(size + 1, false);
                return;
            }
            do {
                size++;
                openVolume(size, false);
                long j5 = this.absoluteLength;
                if (j5 != -1 && this.absoluteOffset >= j5) {
                    return;
                }
            } while (this.volumePositions.get(size).longValue() <= this.absoluteOffset);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw new RuntimeException("close() method not supported. The user should implement its own caching and closing stratagies within the IArchiveOpenVolumeCallback.getStream() implementation.");
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public synchronized int read(byte[] bArr) throws SevenZipException {
        long j4 = this.absoluteLength;
        if (j4 == -1 || this.absoluteOffset < j4) {
            int read = this.currentInStream.read(bArr);
            long j5 = read;
            this.absoluteOffset += j5;
            long j6 = this.currentVolumeOffset + j5;
            this.currentVolumeOffset = j6;
            if (j6 >= this.currentVolumeLength) {
                openVolume(this.currentIndex + 1, true);
            }
            return read;
        }
        return 0;
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public synchronized long seek(long j4, int i4) throws SevenZipException {
        boolean z4;
        long j5;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (this.absoluteLength == -1) {
                            openVolume(Integer.MAX_VALUE, false);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j4 += this.absoluteLength;
                        if (j4 == this.absoluteOffset || z4) {
                            this.absoluteOffset = j4;
                            openVolumeToAbsoluteOffset();
                            j5 = this.absoluteLength;
                            if (j5 == -1 && j5 <= this.absoluteOffset) {
                                this.absoluteOffset = j5;
                                return j5;
                            }
                            long longValue = this.absoluteOffset - this.volumePositions.get(this.currentIndex - 1).longValue();
                            this.currentVolumeOffset = longValue;
                            this.currentInStream.seek(longValue, 0);
                            return j4;
                        }
                        return j4;
                    }
                    throw new RuntimeException("Seek: unknown origin: " + i4);
                }
                j4 += this.absoluteOffset;
            }
            z4 = false;
            if (j4 == this.absoluteOffset) {
            }
            this.absoluteOffset = j4;
            openVolumeToAbsoluteOffset();
            j5 = this.absoluteLength;
            if (j5 == -1) {
            }
            long longValue2 = this.absoluteOffset - this.volumePositions.get(this.currentIndex - 1).longValue();
            this.currentVolumeOffset = longValue2;
            this.currentInStream.seek(longValue2, 0);
            return j4;
        } catch (Throwable th) {
            throw th;
        }
    }

    public VolumedArchiveInStream(String str, IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) throws SevenZipException {
        this.absoluteLength = -1L;
        this.currentIndex = -1;
        ArrayList arrayList = new ArrayList();
        this.volumePositions = arrayList;
        this.archiveOpenVolumeCallback = iArchiveOpenVolumeCallback;
        arrayList.add(0L);
        if (str.endsWith(SEVEN_ZIP_FIRST_VOLUME_POSTFIX)) {
            this.cuttedVolumeFilename = str.substring(0, str.length() - 3);
            openVolume(1, true);
            return;
        }
        throw new SevenZipException("The first 7z volume filename '" + str + "' don't ends with the postfix: '" + SEVEN_ZIP_FIRST_VOLUME_POSTFIX + "'. Can't proceed");
    }
}
