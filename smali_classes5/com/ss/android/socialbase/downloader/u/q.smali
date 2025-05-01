.class public Lcom/ss/android/socialbase/downloader/u/q;
.super Ljava/lang/Object;


# direct methods
.method public static m(Ljava/util/List;)J
    .locals 14
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;)J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    const-wide/16 v2, -0x1

    move-wide v8, v0

    :cond_0
    move-wide v4, v2

    move-wide v6, v4

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ss/android/socialbase/downloader/u/wv;

    cmp-long v11, v4, v2

    if-nez v11, :cond_2

    .line 2
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->vv()J

    move-result-wide v11

    cmp-long v13, v11, v0

    if-lez v13, :cond_1

    .line 3
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->p()J

    move-result-wide v4

    .line 4
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v6

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->p()J

    move-result-wide v11

    cmp-long v13, v11, v6

    if-gtz v13, :cond_3

    .line 6
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v11

    cmp-long v13, v11, v6

    if-lez v13, :cond_1

    .line 7
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v6

    goto :goto_0

    :cond_3
    sub-long/2addr v6, v4

    add-long/2addr v8, v6

    .line 8
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->vv()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    .line 9
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->p()J

    move-result-wide v4

    .line 10
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/u/wv;->i()J

    move-result-wide v6

    goto :goto_0

    :cond_4
    cmp-long p0, v4, v0

    if-ltz p0, :cond_5

    cmp-long p0, v6, v4

    if-lez p0, :cond_5

    sub-long/2addr v6, v4

    add-long/2addr v8, v6

    :cond_5
    return-wide v8
.end method

.method public static vv(Ljava/util/List;)J
    .locals 8
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;)J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 2
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ss/android/socialbase/downloader/u/wv;

    .line 3
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/u/wv;->p()J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-gtz v7, :cond_1

    .line 4
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/u/wv;->o()J

    move-result-wide v5

    cmp-long v7, v5, v1

    if-lez v7, :cond_0

    .line 5
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/u/wv;->o()J

    move-result-wide v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-wide v1
.end method
