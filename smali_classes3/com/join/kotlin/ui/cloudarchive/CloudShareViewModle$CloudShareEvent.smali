.class public final Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle$CloudShareEvent;
.super Ljava/lang/Object;
.source "CloudShareViewModle.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CloudShareEvent"
.end annotation


# instance fields
.field private showdownloadModDialog:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getShowdownloadModDialog()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle$CloudShareEvent;->showdownloadModDialog:I

    return v0
.end method

.method public final setShowdownloadModDialog(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/cloudarchive/CloudShareViewModle$CloudShareEvent;->showdownloadModDialog:I

    return-void
.end method
