.class Lnet/sf/sevenzipjbinding/impl/InArchiveImpl$ExtractSlowCallback;
.super Ljava/lang/Object;
.source "InArchiveImpl.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IArchiveExtractCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/sf/sevenzipjbinding/impl/InArchiveImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ExtractSlowCallback"
.end annotation


# instance fields
.field private extractOperationResult:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

.field sequentialOutStreamParam:Lnet/sf/sevenzipjbinding/ISequentialOutStream;


# direct methods
.method constructor <init>(Lnet/sf/sevenzipjbinding/ISequentialOutStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl$ExtractSlowCallback;->sequentialOutStreamParam:Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    return-void
.end method


# virtual methods
.method getExtractOperationResult()Lnet/sf/sevenzipjbinding/ExtractOperationResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl$ExtractSlowCallback;->extractOperationResult:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-object v0
.end method

.method public getStream(ILnet/sf/sevenzipjbinding/ExtractAskMode;)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 0

    .line 1
    sget-object p1, Lnet/sf/sevenzipjbinding/ExtractAskMode;->EXTRACT:Lnet/sf/sevenzipjbinding/ExtractAskMode;

    invoke-virtual {p2, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl$ExtractSlowCallback;->sequentialOutStreamParam:Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public prepareOperation(Lnet/sf/sevenzipjbinding/ExtractAskMode;)V
    .locals 0

    return-void
.end method

.method public setCompleted(J)V
    .locals 0

    return-void
.end method

.method public setOperationResult(Lnet/sf/sevenzipjbinding/ExtractOperationResult;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl$ExtractSlowCallback;->extractOperationResult:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    return-void
.end method

.method public setTotal(J)V
    .locals 0

    return-void
.end method
