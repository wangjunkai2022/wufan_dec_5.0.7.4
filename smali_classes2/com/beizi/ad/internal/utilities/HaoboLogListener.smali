.class public abstract Lcom/beizi/ad/internal/utilities/HaoboLogListener;
.super Ljava/lang/Object;
.source "HaoboLogListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/utilities/HaoboLogListener$LOG_LEVEL;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getLogLevel()Lcom/beizi/ad/internal/utilities/HaoboLogListener$LOG_LEVEL;
.end method

.method public abstract onReceiveMessage(Lcom/beizi/ad/internal/utilities/HaoboLogListener$LOG_LEVEL;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onReceiveMessage(Lcom/beizi/ad/internal/utilities/HaoboLogListener$LOG_LEVEL;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method
