.class Lcom/vincent/videocompressor/h$b$a;
.super Ljava/lang/Object;
.source "VideoCompress.java"

# interfaces
.implements Lcom/vincent/videocompressor/VideoController$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/vincent/videocompressor/h$b;->b([Ljava/lang/String;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/vincent/videocompressor/h$b;


# direct methods
.method constructor <init>(Lcom/vincent/videocompressor/h$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/vincent/videocompressor/h$b$a;->a:Lcom/vincent/videocompressor/h$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgress(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/h$b$a;->a:Lcom/vincent/videocompressor/h$b;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Float;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/vincent/videocompressor/h$b;->a(Lcom/vincent/videocompressor/h$b;[Ljava/lang/Object;)V

    return-void
.end method
