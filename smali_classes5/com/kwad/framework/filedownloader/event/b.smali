.class public abstract Lcom/kwad/framework/filedownloader/event/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ahX:Ljava/lang/Runnable;

.field protected final ahY:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/event/b;->ahX:Ljava/lang/Runnable;

    .line 3
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/event/b;->ahY:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/event/b;->ahY:Ljava/lang/String;

    return-object v0
.end method
