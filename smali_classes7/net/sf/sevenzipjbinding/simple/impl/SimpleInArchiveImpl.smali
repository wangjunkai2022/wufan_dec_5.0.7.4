.class public Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;
.super Ljava/lang/Object;
.source "SimpleInArchiveImpl.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/simple/ISimpleInArchive;


# instance fields
.field private final sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

.field private wasClosed:Z


# direct methods
.method public constructor <init>(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->wasClosed:Z

    .line 3
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IInArchive;->close()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->wasClosed:Z

    return-void
.end method

.method public getArchiveItem(I)Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    new-instance v0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveItemImpl;

    invoke-direct {v0, p0, p1}, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveItemImpl;-><init>(Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;I)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is out of range. Number of items in archive: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    .line 4
    invoke-interface {p1}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getArchiveItems()[Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->getNumberOfItems()I

    move-result v0

    new-array v1, v0, [Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 2
    new-instance v3, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveItemImpl;

    invoke-direct {v3, p0, v2}, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveItemImpl;-><init>(Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;I)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getNumberOfItems()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->testAndGetSafeSevenZipInArchive()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result v0

    return v0
.end method

.method public testAndGetSafeSevenZipInArchive()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->wasClosed:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/simple/impl/SimpleInArchiveImpl;->sevenZipInArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v1, "Archive was closed"

    invoke-direct {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
